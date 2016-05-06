package com.github.dockerjava.api.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * A node as returned by swarm api
 */
@JsonInclude(Include.NON_NULL)
public class SwarmNode {

    @JsonProperty("ID")
    private String id;

    @JsonProperty("IP")
    private String ip;

    @JsonProperty("Addr")
    private String addr;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Cpus")
    private Integer cpus;

    @JsonProperty("Memory")
    private long memory;

    @JsonProperty("Labels")
    private Map<String, String> labels;

    @JsonProperty("Version")
    private String version;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAddr() {
        return addr;
    }

    public String getIp() {
        return ip;
    }
}
