package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1372 {

    @Ignore    private SampleClass1373 sampleClass;

    public SampleClass1372(){
        sampleClass = new SampleClass1373();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}