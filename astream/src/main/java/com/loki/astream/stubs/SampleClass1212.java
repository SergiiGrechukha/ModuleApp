package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1212 {

    @Ignore    private SampleClass1213 sampleClass;

    public SampleClass1212(){
        sampleClass = new SampleClass1213();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}