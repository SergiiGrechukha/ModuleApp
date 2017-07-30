package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1787 {

    @Ignore    private SampleClass1788 sampleClass;

    public SampleClass1787(){
        sampleClass = new SampleClass1788();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}