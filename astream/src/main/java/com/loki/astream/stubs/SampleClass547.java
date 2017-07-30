package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass547 {

    @Ignore    private SampleClass548 sampleClass;

    public SampleClass547(){
        sampleClass = new SampleClass548();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}