package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1534 {

    @Ignore    private SampleClass1535 sampleClass;

    public SampleClass1534(){
        sampleClass = new SampleClass1535();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}