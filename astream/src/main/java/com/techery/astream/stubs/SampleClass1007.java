package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1007 {

    @Ignore    private SampleClass1008 sampleClass;

    public SampleClass1007(){
        sampleClass = new SampleClass1008();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}