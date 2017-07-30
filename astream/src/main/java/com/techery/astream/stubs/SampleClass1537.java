package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1537 {

    @Ignore    private SampleClass1538 sampleClass;

    public SampleClass1537(){
        sampleClass = new SampleClass1538();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}