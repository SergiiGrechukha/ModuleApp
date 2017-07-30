package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1393 {

    @Ignore    private SampleClass1394 sampleClass;

    public SampleClass1393(){
        sampleClass = new SampleClass1394();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}