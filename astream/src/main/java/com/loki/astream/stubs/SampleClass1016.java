package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1016 {

    @Ignore    private SampleClass1017 sampleClass;

    public SampleClass1016(){
        sampleClass = new SampleClass1017();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}