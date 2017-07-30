package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1867 {

    @Ignore    private SampleClass1868 sampleClass;

    public SampleClass1867(){
        sampleClass = new SampleClass1868();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}