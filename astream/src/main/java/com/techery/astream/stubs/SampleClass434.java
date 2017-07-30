package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass434 {

    @Ignore    private SampleClass435 sampleClass;

    public SampleClass434(){
        sampleClass = new SampleClass435();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}