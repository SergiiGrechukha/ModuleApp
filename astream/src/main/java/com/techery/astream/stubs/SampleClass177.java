package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass177 {

    @Ignore    private SampleClass178 sampleClass;

    public SampleClass177(){
        sampleClass = new SampleClass178();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}