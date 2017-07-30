package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1064 {

    @Ignore    private SampleClass1065 sampleClass;

    public SampleClass1064(){
        sampleClass = new SampleClass1065();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}