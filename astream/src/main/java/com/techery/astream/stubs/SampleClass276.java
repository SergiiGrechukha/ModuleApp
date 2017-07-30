package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass276 {

    @Ignore    private SampleClass277 sampleClass;

    public SampleClass276(){
        sampleClass = new SampleClass277();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}