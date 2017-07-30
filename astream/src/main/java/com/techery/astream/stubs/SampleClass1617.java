package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1617 {

    @Ignore    private SampleClass1618 sampleClass;

    public SampleClass1617(){
        sampleClass = new SampleClass1618();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}