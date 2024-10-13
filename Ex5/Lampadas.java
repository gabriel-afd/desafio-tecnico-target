package Ex5;

/*
O problema é modelado da seguinte forma:

- Existe quatro (4) salas
- A primeira sala tem 3 interruptores que controlam as lâmpadas das outras 3 salas
- Só é possível ir duas vezes as salas das lâmpadas

RESPOSTA:

Nomenando cada sala que contém as lãmpadas por A,B e C. O processo a ser feito é:

- Ligar o interruptor A e esperar por um longo periodo de tempo
- Ligar o interruptor B
- Desligar o interruptor A
- Ir nas salas das lâmpadas e verificar qual está quente e qual está ligada
- A lâmpada quente corresponde ao interruptor A
- A lâmpada ligada corresponde ao interruptor B
- A lâmpada restante corresponte ao interruptor C (apagada e fria)

*/