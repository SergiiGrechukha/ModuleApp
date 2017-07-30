package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass343 {

    @Ignore    private SampleClass344 sampleClass;

    public SampleClass343(){
        sampleClass = new SampleClass344();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}