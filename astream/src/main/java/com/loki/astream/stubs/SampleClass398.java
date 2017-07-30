package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass398 {

    @Ignore    private SampleClass399 sampleClass;

    public SampleClass398(){
        sampleClass = new SampleClass399();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}