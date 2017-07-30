package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1775 {

    @Ignore    private SampleClass1776 sampleClass;

    public SampleClass1775(){
        sampleClass = new SampleClass1776();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}