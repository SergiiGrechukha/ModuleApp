package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1477 {

    @Ignore    private SampleClass1478 sampleClass;

    public SampleClass1477(){
        sampleClass = new SampleClass1478();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}