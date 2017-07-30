package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1412 {

    @Ignore    private SampleClass1413 sampleClass;

    public SampleClass1412(){
        sampleClass = new SampleClass1413();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}