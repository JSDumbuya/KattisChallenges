package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	var n int
	reader := bufio.NewReader(os.Stdin)
	temporary,_ := reader.ReadString('\n')
	n,_ = strconv.Atoi(temporary)
	input := make([]string, 0)

	for i := 0; i < n; i++ {
		temp,_ := reader.ReadString('\n')
		input = append(input, temp)
	}

	fmt.Println(input)

	for i := 0; i < n; i++ {
		if (2*i == 0) {
			break;
		}
	 fmt.Println(input[i])
	}
}