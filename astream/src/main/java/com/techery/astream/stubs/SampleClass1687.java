package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1687 {

    @Ignore    private SampleClass1688 sampleClass;

    public SampleClass1687(){
        sampleClass = new SampleClass1688();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}