package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1722 {

    @Ignore    private SampleClass1723 sampleClass;

    public SampleClass1722(){
        sampleClass = new SampleClass1723();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}