package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1561 {

    @Ignore    private SampleClass1562 sampleClass;

    public SampleClass1561(){
        sampleClass = new SampleClass1562();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}