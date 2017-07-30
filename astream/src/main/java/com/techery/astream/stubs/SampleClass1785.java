package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1785 {

    @Ignore    private SampleClass1786 sampleClass;

    public SampleClass1785(){
        sampleClass = new SampleClass1786();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}