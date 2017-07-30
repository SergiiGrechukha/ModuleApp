package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1701 {

    @Ignore    private SampleClass1702 sampleClass;

    public SampleClass1701(){
        sampleClass = new SampleClass1702();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}