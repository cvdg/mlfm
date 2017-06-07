# mlfm - Malformed

Connect a Sparkfun Weather shield to a Raspberry Pi zero W and publish the values to a MQTT broker.



## Execute

```
mvn exec:java
```

or

```
mvn clean package
java -jar target/mlfm-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## ICs

* Si7021 humidity/temperature sensor
* MPL3115A2 barometric pressure sensor
* ALS-PT19 light sensor


