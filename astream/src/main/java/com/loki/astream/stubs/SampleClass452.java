package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass452 {

    @Ignore    private SampleClass453 sampleClass;

    public SampleClass452(){
        sampleClass = new SampleClass453();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}