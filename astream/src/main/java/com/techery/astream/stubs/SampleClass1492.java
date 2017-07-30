package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1492 {

    @Ignore    private SampleClass1493 sampleClass;

    public SampleClass1492(){
        sampleClass = new SampleClass1493();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}