package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass983 {

    @Ignore    private SampleClass984 sampleClass;

    public SampleClass983(){
        sampleClass = new SampleClass984();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}