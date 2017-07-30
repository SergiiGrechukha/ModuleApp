package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass394 {

    @Ignore    private SampleClass395 sampleClass;

    public SampleClass394(){
        sampleClass = new SampleClass395();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}