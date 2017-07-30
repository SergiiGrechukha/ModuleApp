package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass453 {

    @Ignore    private SampleClass454 sampleClass;

    public SampleClass453(){
        sampleClass = new SampleClass454();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}