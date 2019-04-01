set ns [new Simulator]
set ns [open lab2.anm w]
$ns namtrace-all $nf
set tf [open lab2.tr w]
$ns trace-all $tf
proc finish {} 
{
global ns nf tf
$ns flush-trace
close $nf
close$tf
exec nam lab2.nam &
exit 0
]
set n0 [$ns node]
set n1 [$ns node]
set n2 [$ns node]
set n3 [$ns node]
$ns duplex-link $n0 $n2 10MB 100ms DropTail
$ns duplex-link $n1 $n2 10MB 100ms DropTail
$ns duplex-link $n2 $n3 10MB 100ms DropTail
set tcp0 [new Agent/TCP]
$ns attach-agent $n0 $tcp0
set ftp0 [new Application/FTP]
$ftp0 attach-agent $tcp0
set udp1 [new Agent/UDP]
$ns attach-agent $n1 $udp1
set cbrl [new Application/Traffic/CBR]
$cbrl attach-agent $udp1


