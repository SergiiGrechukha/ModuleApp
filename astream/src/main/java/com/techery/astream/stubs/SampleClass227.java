package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass227 {

    @Ignore    private SampleClass228 sampleClass;

    public SampleClass227(){
        sampleClass = new SampleClass228();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}