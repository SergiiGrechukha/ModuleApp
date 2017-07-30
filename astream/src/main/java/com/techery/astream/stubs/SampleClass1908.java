package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1908 {

    @Ignore    private SampleClass1909 sampleClass;

    public SampleClass1908(){
        sampleClass = new SampleClass1909();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}