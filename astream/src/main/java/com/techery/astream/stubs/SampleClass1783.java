package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1783 {

    @Ignore    private SampleClass1784 sampleClass;

    public SampleClass1783(){
        sampleClass = new SampleClass1784();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}