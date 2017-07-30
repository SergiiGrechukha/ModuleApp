package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1448 {

    @Ignore    private SampleClass1449 sampleClass;

    public SampleClass1448(){
        sampleClass = new SampleClass1449();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}