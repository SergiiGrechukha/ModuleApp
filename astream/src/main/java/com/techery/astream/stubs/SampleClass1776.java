package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1776 {

    @Ignore    private SampleClass1777 sampleClass;

    public SampleClass1776(){
        sampleClass = new SampleClass1777();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}