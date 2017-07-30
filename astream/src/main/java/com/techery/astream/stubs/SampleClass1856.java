package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1856 {

    @Ignore    private SampleClass1857 sampleClass;

    public SampleClass1856(){
        sampleClass = new SampleClass1857();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}