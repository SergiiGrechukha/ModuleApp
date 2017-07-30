package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1348 {

    @Ignore    private SampleClass1349 sampleClass;

    public SampleClass1348(){
        sampleClass = new SampleClass1349();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}