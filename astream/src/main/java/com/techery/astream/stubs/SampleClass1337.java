package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1337 {

    @Ignore    private SampleClass1338 sampleClass;

    public SampleClass1337(){
        sampleClass = new SampleClass1338();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}