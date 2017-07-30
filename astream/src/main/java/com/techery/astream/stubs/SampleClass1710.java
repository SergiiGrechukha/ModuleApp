package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1710 {

    @Ignore    private SampleClass1711 sampleClass;

    public SampleClass1710(){
        sampleClass = new SampleClass1711();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}