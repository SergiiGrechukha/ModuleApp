package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass213 {

    @Ignore    private SampleClass214 sampleClass;

    public SampleClass213(){
        sampleClass = new SampleClass214();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}