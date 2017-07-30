package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1109 {

    @Ignore    private SampleClass1110 sampleClass;

    public SampleClass1109(){
        sampleClass = new SampleClass1110();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}