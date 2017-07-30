package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1765 {

    @Ignore    private SampleClass1766 sampleClass;

    public SampleClass1765(){
        sampleClass = new SampleClass1766();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}