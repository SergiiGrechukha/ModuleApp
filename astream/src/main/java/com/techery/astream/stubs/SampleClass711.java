package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass711 {

    @Ignore    private SampleClass712 sampleClass;

    public SampleClass711(){
        sampleClass = new SampleClass712();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}