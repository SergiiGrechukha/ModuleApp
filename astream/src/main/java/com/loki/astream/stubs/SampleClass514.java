package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass514 {

    @Ignore    private SampleClass515 sampleClass;

    public SampleClass514(){
        sampleClass = new SampleClass515();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}