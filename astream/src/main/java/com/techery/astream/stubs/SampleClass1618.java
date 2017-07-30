package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1618 {

    @Ignore    private SampleClass1619 sampleClass;

    public SampleClass1618(){
        sampleClass = new SampleClass1619();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}