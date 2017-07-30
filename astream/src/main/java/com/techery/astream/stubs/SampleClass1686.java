package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1686 {

    @Ignore    private SampleClass1687 sampleClass;

    public SampleClass1686(){
        sampleClass = new SampleClass1687();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}