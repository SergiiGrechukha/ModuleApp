package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass366 {

    @Ignore    private SampleClass367 sampleClass;

    public SampleClass366(){
        sampleClass = new SampleClass367();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}