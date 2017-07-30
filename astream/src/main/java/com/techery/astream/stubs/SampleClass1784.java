package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1784 {

    @Ignore    private SampleClass1785 sampleClass;

    public SampleClass1784(){
        sampleClass = new SampleClass1785();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}