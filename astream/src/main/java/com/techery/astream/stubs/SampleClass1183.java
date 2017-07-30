package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1183 {

    @Ignore    private SampleClass1184 sampleClass;

    public SampleClass1183(){
        sampleClass = new SampleClass1184();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}